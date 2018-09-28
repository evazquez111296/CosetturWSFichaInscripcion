package com.cosettur.helpers;

import static com.cosettur.helpers.ConnectionManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evazquez
 */
public class FichaInscripcionHelper {
    
    public static int consultar(String fecha,String usuario,HorarioHelper[] horario) throws SQLException{
        int result=0;
        try {
            String query="SELECT Folio FROM Ficha_Inscripcion WHERE fecha =?;";
            PreparedStatement preparedStatement;
            
            preparedStatement=getConnection().prepareStatement(query);
            preparedStatement.setString(1, fecha);
            ResultSet rs =preparedStatement.executeQuery();
            result=0;
            while(rs.next()){
                result= rs.getInt("folio");
                break;
            }
            getConnection().close();
            String inicioLunes=horario[0].getEntrada();
            String finLunes=horario[0].getSalida();
            String inicioMartes=horario[1].getEntrada();
            String finMartes=horario[1].getSalida();
            String inicioMiercoles=horario[2].getEntrada();
            String finMiercoles=horario[2].getSalida();
            String inicioJueves=horario[3].getEntrada();
            String finJueves=horario[3].getSalida();
            String inicioViernes=horario[4].getEntrada();
            String finViernes=horario[4].getSalida();
            String q2="INSERT INTO Horario(Folio,"
                    + "Fecha_Inicio_Lunes,Fecha_Fin_Lunes,"
                    + "Fecha_Inicio_Martes,Fecha_Fin_Martes,"
                    + "Fecha_Inicio_Miercoles,Fecha_Fin_Miercoles,"
                    + "Fecha_Inicio_Jueves,Fecha_Fin_Jueves,"
                    + "Fecha_Inicio_Viernes,Fecha_Fin_Viernes)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps;
            ps=getConnection().prepareStatement(q2);
            ps.setInt(1, result);
            ps.setString(2, inicioLunes);
            ps.setString(3, finLunes);
            ps.setString(4, inicioMartes);
            ps.setString(5, finMartes);
            ps.setString(6, inicioMiercoles);
            ps.setString(7, finMiercoles);
            ps.setString(8, inicioJueves);
            ps.setString(9, finJueves);
            ps.setString(10, inicioViernes);
            ps.setString(11, finViernes);
            ps.executeUpdate();
            ps.getConnection().commit();
            return result;
        } catch (SQLException ex) {
            result=0;
            if(getConnection()!=null){
                getConnection().rollback();
            }
            Logger.getLogger(FichaInscripcionHelper.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(getConnection()!=null){
                getConnection().close();
            }
            return result;
        }
    }
    
}
