import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class lista {
    private String nombre;
    private boolean actividades;
    private List<actividad> actividads;

    public lista (String nombre, boolean actividades){
        this.nombre=nombre;
        this.actividades = actividades;
        actividads = new ArrayList<>();
    }
    public void addactividad (String nombre, String descripcion, LocalDate creacion, Date EjecucionDiseño){
     var actividadTmp = new actividad(nombre,descripcion,creacion);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActividades() {
        return actividades;
    }

    public void setActividades(boolean actividades) {
        this.actividades = actividades;
    }

}
