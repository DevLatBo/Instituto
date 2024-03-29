/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package institucion.Controllers;

import institucion.Models.BD.LogginBD;
import java.util.HashMap;

/**
 *
 * @author Oscar
 */
public class CtrlLoggin {
    private LogginBD mod;
    
    public CtrlLoggin(){
        mod = new LogginBD();
    }
    
    public HashMap validateUser(String username, String pass){
        HashMap<Integer, String> data = new HashMap();
        if(username.length() != 0 || 
                pass.length() != 0){
            data = mod.authorizeUser(username, pass);
        }
        return data;
    }
    public int validateCode(String code){
        int res = 0;
        try{
            int user_code = Integer.parseInt(code);
            if(mod.validateUser(user_code) == 1){
                res = 1;
            }
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        return res;
    }
}
