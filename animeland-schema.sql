CREATE TABLE anime(
	nID INTEGER PRIMARY KEY CHECK (nID >= 0),
	cNombre CHAR(20) CHECK (cNombre != '') NOT NULL,
	cGenero CHAR(10) CHECK (cGenero IN('Kodomo', 'Shonen', 'Shojo', 'Seinen', 'Josei')) NOT NULL,
	nTemporadas INTEGER CHECK (nTemporadas >= 1),
	lEmision BOOLEAN DEFAULT FALSE NOT NULL
);

CREATE TABLE estudio(
	nCIF INTEGER PRIMARY KEY CHECK (nCIF > 0),
	cNombre CHAR(20) CHECK (cNombre != '') NOT NULL,
	nTrabajadores INTEGER CHECK (nTrabajadores > 0) NOT NULL,
	cPais CHAR(10) CHECK (cPais != '') NOT NULL,
	cCiudad CHAR(10) CHECK (cCiudad != '') NOT NULL
);

CREATE TABLE animeestudio(
	nID INTEGER,
	nCIF INTEGER,
    FOREIGN KEY(nID) REFERENCES anime(nID)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
    FOREIGN KEY(nCIF) REFERENCES estudio(nCIF)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
	PRIMARY KEY (nID, nCIF)
);