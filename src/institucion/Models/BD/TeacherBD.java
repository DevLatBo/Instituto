/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package institucion.Models.BD;

import config.Conexion;
import institucion.Models.Users.Teacher;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
/**
 *
 * @author master
 */
public class TeacherBD {
    public  boolean add(Teacher t){
        boolean res = false;
        Connection conn = null;
        PreparedStatement ptmt = null;
        Date sql_date = new Date(t.getBirthday().getTime()); 
        String query = "UPDATE Teacher set first_name=?, last_name=?, birthday=?, address=?, place_birth=? WHERE id=?";
        try {
            conn = Conexion.getInstance().getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setString(1, t.getFirst_name());
            ptmt.setString(2, t.getLast_name());
            ptmt.setDate(3, sql_date);
            ptmt.setString(4, t.getAddress());
            ptmt.setString(5, t.getPlace_birth());
            ptmt.setInt(6, 1);
            ptmt.executeUpdate();
            
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return res;
    }
    public Teacher getTeacherByID(int id){
        Teacher t = new Teacher();
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Teacher WHERE id = ?";
        try {
            conn = Conexion.getInstance().getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            rs = ptmt.executeQuery();
            rs.next();
            t.setFirst_name(rs.getString("first_name"));
            t.setLast_name(rs.getString("last_name"));
            t.setBirthday(rs.getDate("birthday"));
            t.setPlace_birth(rs.getString("place_birth"));
            t.setAddress(rs.getString("address"));
			t.setPhoto(rs.getString("photo"));
            rs.close();
            ptmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return t;
    }
    public Object[][] getAttendances(int id){
        Object[][] attendances  = {};
        Connection conn         = null;
        ResultSet rs            = null;
        PreparedStatement ptmt  = null;
        String query        = "SELECT attendance_status, time_attendance FROM attendance WHERE teacher_id = ? LIMIT 15"; 
        try{
            conn = Conexion.getInstance().getConnection();
            ptmt = conn.prepareStatement(query);
            ptmt.setInt(1, id);
            rs = ptmt.executeQuery();
            rs.beforeFirst();  
            rs.last();  
            int tam = rs.getRow(); 
            attendances = new Object[tam][2];
            rs = ptmt.executeQuery();
            int i=0;
            while(rs.next()){
                attendances[i][0] = rs.getString("attendance_status");
                attendances[i][1] = rs.getDate("time_attendance") + " " + rs.getTime("time_attendance");
                i++;
            }
            
            rs.close();
            ptmt.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return attendances;
    }
    /* Method will be changed for other query*/
    public HashMap getClassRooms(){
        HashMap classrooms      = new HashMap();
        Connection conn     = null;
        ResultSet rs        = null;
        PreparedStatement ptmt = null;
        String query = "SELECT * FROM  classroom";
        try{
            conn = Conexion.getInstance().getConnection();
            ptmt = conn.prepareStatement(query);
            rs = ptmt.executeQuery();
            while(rs.next()){
                classrooms.put(rs.getInt("id"), rs.getString("name"));
            }
            rs.close();
            ptmt.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return classrooms;
    }
	public ArrayList<String> getMessages(int classroom_id, int teacher_id){
		ArrayList<String> messages = new ArrayList<String>();
		Connection conn			= null;
		ResultSet rs			= null;
		PreparedStatement ptmt	= null;
		String query = "SELECT title "
					+ "FROM message "
					+ "WHERE teacher_id = ? AND classroom_id = ?";
		try{
			conn = Conexion.getInstance().getConnection();
			ptmt = conn.prepareStatement(query);
			ptmt.setInt(1, teacher_id);
			ptmt.setInt(2, classroom_id);
			rs = ptmt.executeQuery();
			while(rs.next()){
				messages.add(rs.getString("title"));
			}
			rs.close();
			ptmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		return messages;
	}
	public Hashtable getMessages2(int classroom_id, int teacher_id){
		Hashtable messages = new Hashtable();
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String query = "SELECT id, title "
					+ "FROM message "
					+ "WHERE teacher_id = ? AND classroom_id = ?";
		try{
			conn = Conexion.getInstance().getConnection();
			ptmt = conn.prepareStatement(query);
			ptmt.setInt(1, teacher_id);
			ptmt.setInt(2, classroom_id);
			rs = ptmt.executeQuery();
			while(rs.next()){
				messages.put(rs.getInt("id"), rs.getString("title"));
			}
			rs.close();
			ptmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.println(e);	
		}
		return messages;
	}
	public HashMap getSubjectsbyTeacherId(int id){
		HashMap subjects = new HashMap();
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ptmt = null;
		String query = "SELECT id, name "
					+ "FROM subject "
					+ "WHERE teacher_id= ?";
		try{
			conn = Conexion.getInstance().getConnection();
			ptmt = conn.prepareStatement(query);
			ptmt.setInt(1, id);
			rs = ptmt.executeQuery();
			while(rs.next()){
				subjects.put(rs.getInt("id"), rs.getString("name"));
			}
			rs.close();
			ptmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		return subjects;
	}
	public String getMessageByID(int teacher_id){
		String message = "";
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String query = "SELECT content "
						+ "FROM message "
						+ "WHERE id = ?";
		try{
			conn = Conexion.getInstance().getConnection();
			ptmt = conn.prepareStatement(query);
			ptmt.setInt(1, teacher_id);
			rs = ptmt.executeQuery();
			rs.next();
			message = rs.getString("content");
			
			rs.close();
			ptmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		return message;
	}
}
