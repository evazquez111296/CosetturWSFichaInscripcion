
package com.cosettur.ws;

import com.cosettur.models.dao.FichaInscripcionDAO;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.cosettur.helpers.HorarioHelper;
/**
 *
 * @author evazquez
 */
@WebService(serviceName = "CosetturWS")
public class CosetturWS {
    
            @WebMethod(operationName="inscribirHorario")
            public int inscribirHorario(
            @WebParam(name = "user") String usuario,
            @WebParam(name="grado")  byte grado,
            @WebParam(name="semestre")  byte semestre,
            @WebParam(name="ruta")  short ruta,
            @WebParam(name="localidad") String localidad,
            @WebParam(name="modalidad")  byte modalidad,
            @WebParam(name="ciclo")  byte ciclo,
            @WebParam(name="tutor")  String tutor,
            @WebParam(name="tutorado") String tutorado,
            @WebParam(name="horario") HorarioHelper[] horario,
            @WebParam(name="pago") float pago,
            @WebParam(name="tel") String tel

    ){
                
        java.util.Date dt = new java.util.Date();

java.text.SimpleDateFormat sdf = 
     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

String currentTime = sdf.format(dt);
        return FichaInscripcionDAO.realizar(grado, semestre, ruta, localidad, modalidad, ciclo, tutor, tutorado, usuario, tel, pago, currentTime,horario);
        
    }
}
