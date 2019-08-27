/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.reporting.model;

import java.time.LocalDateTime;

/**
 *
 * @author ctorrest
 */
public class TicketHomeResult {

    public static final int GREEN = 1;
    public static final int YELLOW = 2;
    public static final int RED = 3;

    private int IdAtencion;
    private String Paciente;
    private String Genero;
    private String Codigo_CIE10;
    private String Diagnostico;
    private LocalDateTime Fecha_Ingreso;
    private LocalDateTime Fecha_Probable_Salida;
    private int CodCama;
    private String Medico_Tratante;
    private int DiasPostergacion;
    private String Causal;
    private String Usuario;
    private LocalDateTime Fecha_Registro;

    public int getIdAtencion() {
        return IdAtencion;
    }

    public void setIdAtencion(int IdAtencion) {
        this.IdAtencion = IdAtencion;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCodigo_CIE10() {
        return Codigo_CIE10;
    }

    public void setCodigo_CIE10(String Codigo_CIE10) {
        this.Codigo_CIE10 = Codigo_CIE10;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public LocalDateTime getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(LocalDateTime Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public LocalDateTime getFecha_Probable_Salida() {
        return Fecha_Probable_Salida;
    }

    public void setFecha_Probable_Salida(LocalDateTime Fecha_Probable_Salida) {
        this.Fecha_Probable_Salida = Fecha_Probable_Salida;
    }

    public int getCodCama() {
        return CodCama;
    }

    public void setCodCama(int CodCama) {
        this.CodCama = CodCama;
    }

    public String getMedico_Tratante() {
        return Medico_Tratante;
    }

    public void setMedico_Tratante(String Medico_Tratante) {
        this.Medico_Tratante = Medico_Tratante;
    }

    public int getDiasPostergacion() {
        return DiasPostergacion;
    }

    public void setDiasPostergacion(int DiasPostergacion) {
        this.DiasPostergacion = DiasPostergacion;
    }

    public String getCausal() {
        return Causal;
    }

    public void setCausal(String Causal) {
        this.Causal = Causal;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public LocalDateTime getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(LocalDateTime Fecha_Registro) {
        this.Fecha_Registro = Fecha_Registro;
    }

    public int getColor() {
        return GREEN;
    }
}
