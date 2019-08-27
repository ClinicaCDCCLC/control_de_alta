/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.models;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ctorrest
 */
public class TicketHomeResult {
    
    private static final DateTimeFormatter FP_FORMATTER = DateTimeFormatter.ofPattern("d/MM/yyyy");
    
    public static final int DEFAULT = 0;
    public static final int YELLOW = 1;
    public static final int ORANGE = 2;
    public static final int RED = 3;
    
    private int id_atencion;
    private String paciente;
    private String genero;
    private String codigo_CIE10;
    private String diagnostico;
    private LocalDateTime fecha_ingreso;
    private LocalDate fecha_probable_salida;
    private String cod_cama;
    private String medico_tratante;
    private int dias_postergacion;
    private String causal;
    private String usuario;
    private LocalDateTime fecha_registro;
    private int id_ubicacion;
    private String nom_ubicacion;
    private int color;
    
    public int getId_ubicacion() {
        return id_ubicacion;
    }
    
    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }
    
    public String getNom_ubicacion() {
        return nom_ubicacion;
    }
    
    public void setNom_ubicacion(String nom_ubicacion) {
        this.nom_ubicacion = nom_ubicacion;
    }
    
    public int getId_atencion() {
        return id_atencion;
    }
    
    public void setId_atencion(int id_atencion) {
        this.id_atencion = id_atencion;
    }
    
    public String getPaciente() {
        return paciente;
    }
    
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getCodigo_CIE10() {
        return codigo_CIE10;
    }
    
    public void setCodigo_CIE10(String codigo_CIE10) {
        this.codigo_CIE10 = codigo_CIE10;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public LocalDateTime getFecha_ingreso() {
        return fecha_ingreso;
    }
    
    public void setFecha_ingreso(Timestamp fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso.toLocalDateTime();
    }
    
    public LocalDate getFecha_probable_salida() {
        return fecha_probable_salida;
    }
    
    public void setFecha_probable_salida(String fecha_probable_salida) {
        this.fecha_probable_salida = LocalDate.parse(fecha_probable_salida, FP_FORMATTER);
    }
    
    public String getCod_cama() {
        return cod_cama;
    }
    
    public void setCod_cama(String cod_cama) {
        this.cod_cama = cod_cama;
    }
    
    public String getMedico_tratante() {
        return medico_tratante;
    }
    
    public void setMedico_tratante(String medico_tratante) {
        this.medico_tratante = medico_tratante;
    }
    
    public int getDias_postergacion() {
        return dias_postergacion;
    }
    
    public void setDias_postergacion(int dias_postergacion) {
        this.dias_postergacion = dias_postergacion;
    }
    
    public String getCausal() {
        return causal;
    }
    
    public void setCausal(String causal) {
        this.causal = causal;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }
    
    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro.toLocalDateTime();
    }
    
    public int getColor() {
        return color;
    }
    
    public void setColor(int color) {
        this.color = color;
    }
}
