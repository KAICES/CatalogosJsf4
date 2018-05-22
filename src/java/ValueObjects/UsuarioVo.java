/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;


public class UsuarioVo {

    private String nombreVo;
    
    private String generoVo;
    
    private String edadVo;

    public UsuarioVo(String nombreVo, String generoVo, String edadVo) {
        this.nombreVo = nombreVo;
        this.generoVo = generoVo;
        this.edadVo = edadVo;
    }

    public String getNombreVo() {
        return nombreVo;
    }

    public void setNombreVo(String nombreVo) {
        this.nombreVo = nombreVo;
    }

    public String getGeneroVo() {
        return generoVo;
    }

    public void setGeneroVo(String generoVo) {
        this.generoVo = generoVo;
    }

    public String getEdadVo() {
        return edadVo;
    }

    public void setEdadVo(String edadVo) {
        this.edadVo = edadVo;
    }
    
    
    
    
}
