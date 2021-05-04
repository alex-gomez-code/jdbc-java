package test;

import controllers.AnimeController;
import controllers.AnimeEstudioController;
import controllers.EstudioController;
import java.sql.Connection;
import java.util.List;
import models.Anime;
import models.AnimeEstudio;
import models.Estudio;
import utils.Conexion;

public class Test {
    
    public static void main(String[] args) {
        //Crear conexión
        Conexion utilidades = new Conexion("jdbc:mysql://localhost:3306/animeland?characterEncoding=utf8","root","1234");
        Connection conn = utilidades.getConnection();
        //Probar cada método de los controladores
        EstudioController ec = new EstudioController(conn);
        List<Estudio> lista = ec.selectAllEstudios();
        System.out.println(ec.updateEstudio(6, "Ufotable", 50, "Japón", "Tokio"));
        System.out.println(ec.insertEstudio(7, "Toei Animation", 100, "Japón", "Tokio"));
        for (Estudio e: lista) {
            System.out.println(e);
        }
        
        AnimeController ac = new AnimeController(conn);
        List<Anime> lista2 = ac.selectAllAnimes();
        System.out.println(ac.insertAnime(6, "Kimetsu no Yaiba", "Shonen", 2, true));
        //System.out.println(ac.updateAnime(7, "Dragon Ball", "Shonen", 4, false));
        //System.out.println(ac.deleteAnime(6));
        for (Anime a: lista2){
            System.out.println(a);
        }
        
        
        
        AnimeEstudioController aec = new AnimeEstudioController(conn);
        List<AnimeEstudio> lista3 = aec.selectAllAnimeEstudios();
        System.out.println(aec.updateAnimeEstudio(7, 7));
        System.out.println(aec.deleteAnimeEstudio(7));
        System.out.println(aec.insertAnimeEstudio(7, 2));
        for (AnimeEstudio ae: lista3){
            System.out.println(ae);
        }
        utilidades.closeConnection(conn);
    }
}
