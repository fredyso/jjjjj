/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import consultas.Consu_tien;
import javax.swing.JOptionPane;

/**
 *
 * @author NAVARRO
 */
public class func_tien {
    Consu_tien obj_consu_tien;
public func_tien(){
    obj_consu_tien=new Consu_tien();
}
public void InsertarSucursal(String codigo,String nombre,String direccion,String telefono,String correo){
    String ruc=obj_consu_tien.RetornnarRuc();
    String comprobar=obj_consu_tien.InsertarSucursal(codigo, nombre, direccion, telefono, correo, ruc);
    if(comprobar.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"Se registró correctamente");
    }
    else{
       JOptionPane.showMessageDialog(null,"error al Registrar"); 
    }
}

    
}
