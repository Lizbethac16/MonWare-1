/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.mycompany.prueba.Comentario;
import com.mycompany.prueba.ComentarioDAO;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;
/**
 *
 * @author jorge
 */
@ManagedBean
@RequestScoped
@ViewScoped

public class ComentarioBeam {
    
    public Comentario comen;
    
    private static List<Comentario> lista = new ArrayList();

    public List<Comentario> getLista() {
        return lista;
    }
    
    public static void setLista(List<Comentario> lista) {
      ComentarioBeam.lista = lista;
    }
    
    public static void update(){
        ComentarioDAO comentarioDAO = new ComentarioDAO();
        ComentarioBeam.lista = comentarioDAO.buscaPorMarcador(VerMarcadorC.select.getIdmarcador());
    }
    
    public static void udate(){
        ComentarioDAO comentarioDAO = new ComentarioDAO();
        ComentarioBeam.lista = comentarioDAO.buscaPorMarcador(VerMarcadorD.select.getIdmarcador());
    }
    
    public static void u(){
        ComentarioDAO comentarioDAO = new ComentarioDAO();
        ComentarioBeam.lista = comentarioDAO.buscaPorMarcador(VerMarcadores.select.getIdmarcador());
    }
    
}

