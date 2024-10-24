package ec.edu.espol;

import java.util.Date;

public class Incidente {
    protected int id;
    protected Date fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected java.util.Collections logActualizaciones;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsable;

}
