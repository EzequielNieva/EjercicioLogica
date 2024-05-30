package com.gm.servicio;

import com.gm.dao.AlumnoDAO;
import com.gm.domain.Alumno;
import java.util.List;

public class ServicioAlumno {
    
    private AlumnoDAO alumnoDao = new AlumnoDAO();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
    
    public void guaradarAlumno(Alumno alumno){
        if(alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertar(alumno);
        }else{
            alumnoDao.actualizar(alumno);
        }
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDao.eliminar(alumno);
    }
    
    public Alumno encontrarAlumno(Alumno alumo){
        return alumnoDao.buscarPorId(alumo);
    }
}
