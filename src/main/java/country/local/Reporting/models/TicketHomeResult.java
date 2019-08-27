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

    private int idAtencion;
    private String paciente;
    private String genero;
    private String codigo_CIE10;
    private String diagnostico;
    private LocalDateTime fecha_ingreso;
    private LocalDate fecha_probable_salida;
    private String codCama;
    private String medico_tratante;
    private int diasPostergacion;
    private String causal;
    private String usuario;
    private LocalDateTime fecha_registro;
    private int idUbicacion;
    private String nomUbicacion;
    private int color;

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
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

    public String getCodCama() {
        return codCama;
    }

    public void setCodCama(String codCama) {
        this.codCama = codCama;
    }

    public String getMedico_tratante() {
        return medico_tratante;
    }

    public void setMedico_tratante(String medico_tratante) {
        this.medico_tratante = medico_tratante;
    }

    public int getDiasPostergacion() {
        return diasPostergacion;
    }

    public void setDiasPostergacion(int diasPostergacion) {
        this.diasPostergacion = diasPostergacion;
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

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNomUbicacion() {
        return nomUbicacion;
    }

    public void setNomUbicacion(String nomUbicacion) {
        this.nomUbicacion = nomUbicacion;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
