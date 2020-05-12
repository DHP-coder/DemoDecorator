/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodecorator;

/**
 *
 * @author DangHoaiPhong
 */
public class Tru extends BieuThucDecorator{
    private float toanHang;


    public Tru(float toanHang, BieuThuc bthuc) {
        super(bthuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+bthuc.bieuThuc()+"-"+toanHang+")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float giaTri() {
        return bthuc.giaTri()-toanHang; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
