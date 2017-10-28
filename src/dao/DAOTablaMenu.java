package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Ingrediente;
import vos.Menu;
import vos.Pedido;
import vos.Postre;

public class DAOTablaMenu {
	
	
	private ArrayList<Object> recursos;

	private Connection conn;

	public DAOTablaMenu() {
		recursos = new ArrayList<Object>();
	}
	
	public void cerrarRecursos() {
		for(Object ob : recursos){
			if(ob instanceof PreparedStatement)
				try {
					((PreparedStatement) ob).close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		}
	}
	
	
	public void setConn(Connection con){
		this.conn = con;
	}


	
	
	
	public Menu buscarMenuPorIdRestaurante(Long id) throws SQLException, Exception {
		
		Menu menu = null;
		
		String sql = "SELECT * FROM MENU_ACOMPANIAMIENTO WHERE COD_RESTAURANTE =" + id;
		
		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();
		
		
		
		if(rs.next()) 
		{
			
			
			
			
		}

		
		
		return menu;	
	}
	
	
	
	
	
	
	
	
	
//	public ArrayList<Menu> darMenus() throws SQLException, Exception {
//		ArrayList<Menu> menus = new ArrayList<Menu>();
//
//		String sql = "SELECT * FROM MENU";
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		ResultSet rs = prepStmt.executeQuery();
//
//		while (rs.next()) {
//			
//			Long idRestaurante = rs.getLong("COD_RESTAURANTE");
//			
//			Menu entr = new Menu(idRestaurante);
//			menus.add(entr);
//		}
//		return menus;
//	}
	
	
	
//	public ArrayList<Menu> buscarMenuPorRestauranteID(Long idRestaurante) throws SQLException, Exception {
//		ArrayList<Menu> menus = new ArrayList<Menu>();
//
//		String sql = "SELECT * FROM POSTRE WHERE COD_RESTAURANTE ='" + idRestaurante + "'";
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		ResultSet rs = prepStmt.executeQuery();
//
//		while (rs.next()) {
//			
//			
//			Long idRestaurante2 = rs.getLong("COD_RESTAURANTE");			
//			
//			Menu entr = new Menu(idRestaurante2);
//			menus.add(entr);		
//		}
//
//		return menus;
//	}
	
	
	
	
	
	
//	public void addMenu(Menu menu) throws SQLException, Exception {
//
//		String sql = "INSERT INTO MENU VALUES (";
//		sql += menu.getIdRestaurante() + ")";
//		
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		prepStmt.executeQuery();
//	}
	
	
	

//	public void deleteMenu(Menu menu) throws SQLException, Exception {
//
//		String sql = "DELETE FROM MENU";
//		sql += " WHERE COD_RESTAURANTE = " + menu.getIdRestaurante();
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		prepStmt.executeQuery();
//	}
	
	
	
	
	
	

}
