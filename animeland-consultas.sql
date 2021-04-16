-- LISTAR DATOS
SELECT * FROM anime;
SELECT * FROM estudio;
SELECT * FROM animeestudio;
-- BORRAR DATOS
DELETE FROM anime;
DELETE FROM estudio;
DELETE FROM animeestudio;
-- MODIFICAR TABLA
ALTER TABLE anime ADD COLUMN nCapitulos INTEGER;
ALTER TABLE estudio ADD COLUMN lExiste BOOLEAN DEFAULT TRUE;
-- INSERTAR DATOS
INSERT INTO anime VALUES (1, 'Naruto', 'Shonen', 21, FALSE);
INSERT INTO anime VALUES (2, 'One Piece', 'Shonen', 20, TRUE);
INSERT INTO anime VALUES (3, 'Boku No Hero', 'Shonen', 5, TRUE);
INSERT INTO anime VALUES (4, 'Haykiuu', 'Shonen', 4, FALSE);
INSERT INTO anime VALUES (5, 'Love is war', 'Seinen', 2, FALSE);

INSERT INTO estudio VALUES (1, 'Pierrot', 100, 'Japón', 'Tokio');
INSERT INTO estudio VALUES (2, 'Toei Animation', 100, 'Japón', 'Tokio');
INSERT INTO estudio VALUES (3, 'Bones', 75, 'Japón', 'Tokio');
INSERT INTO estudio VALUES (4, 'Production I.G', 50, 'Japón', 'Tokio');
INSERT INTO estudio VALUES (5, 'A-1 Pictures', 50, 'Japón', 'Tokio');

INSERT INTO animeestudio VALUES (1, 1);
INSERT INTO animeestudio VALUES (2, 2);
INSERT INTO animeestudio VALUES (3, 3);
INSERT INTO animeestudio VALUES (4, 4);
INSERT INTO animeestudio VALUES (5, 5);