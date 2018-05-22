/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import ValueObjects.UsuarioVo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author TIC-SCI
 */
@ManagedBean
@RequestScoped
public class CatalogoBb {

    private String nombre;
    
    private String genero;
    
    private String edad;
    
    private List<UsuarioVo>miLista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public List<UsuarioVo> getMiLista() {
        return miLista;
    }

    public void setMiLista(List<UsuarioVo> miLista) {
        this.miLista = miLista;
    }
    
    
    
    public CatalogoBb() {      
    }
    
        
    public void registrarse(){
        
                
        UsuarioVo miUsuario;        
        miLista = new ArrayList<UsuarioVo>();        
        
        miUsuario= new UsuarioVo(getNombre(),getGenero(),getEdad());
        miLista.add(miUsuario);
        
    }
    public String comprobar (){
        
        UsuarioVo miUsuario;        
            miLista = new ArrayList<UsuarioVo>();        

            miUsuario= new UsuarioVo("Este es el catalogo de productos para: "+getNombre()," de genero "+getGenero()," y con "+getEdad()+" años");
            miLista.add(miUsuario);
            
            
        Calendar cal = Calendar.getInstance();        
        int dia = cal.get(Calendar.DATE);
        int mod = dia % 2;    
        
        String retorno = "" ; 
        String sedad = getEdad();
        int numedad = Integer.parseInt(sedad);
        int numgenero = 0 ;
       
        if (getGenero().equals("MASCULINO")){
            numgenero = 1;
        }else{
            numgenero = 2;
            
        }
        
        switch (numgenero) {

 

        case 1:

            if (numedad < 18){

                if (mod == 1){
                    
                    retorno = "azul";
                }else{
                    
                    retorno = "azuldesc";
                }

            }else{
                
                if (mod == 1){
                    
                    retorno = "gris";
                }else{
                    
                    retorno = "grisdesc";
                }             
            }
        
            break;
            

        case 2:

            if (numedad < 18){

               if (mod == 1){
                    
                    retorno = "rosado";
                }else{
                    
                    retorno = "rosadodesc";
                }

            }else{

                if (mod == 1){
                    
                    retorno = "rojo";
                }else{
                    
                    retorno = "rojodesc";
                }
               
            }   
            
            break;

        default:

        break;
        
        } 
        return retorno;
    }
}
