import java.time.LocalDate;
import java.util.Date;
public class actividad {
    private  String nombre;
    private  String descripcion;
    private LocalDate creacion;
    private  Date EjecucionDiseño;
    private  boolean completo;

    public actividad(String nombre, String descripcion, LocalDate creacion, Date EjecucionDiseño) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creacion = LocalDate.now();
        this.EjecucionDiseño = EjecucionDiseño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public Date getEjecucionDiseño() {
        return EjecucionDiseño;
    }

    public void setEjecucionDiseño(Date ejecucionDiseño) {
        EjecucionDiseño = ejecucionDiseño;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }
}
