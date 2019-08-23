/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.dbo.queries.results;

import java.time.LocalDateTime;

/**
 *
 * @author ctorrest
 */
public class TicketHomeResult {
    
    private int IdAtencion;
    private String Paciente;
    private String Genero;
    private String Codigo_CIE10;
    private String Diagnostico;
    private LocalDateTime Fecha_Ingreso;
    private LocalDateTime Fecha_Probable_Salida;
    private int CodCama;
    private String Medico_Tratante;
    private LocalDateTime Fecha_Egreso;
    private int DiasPostergacion;
    private String Causal;
    private String Usuario;
    private LocalDateTime Fecha_Registro;
    private String Edad;
    private String codCie1;
    private String nomDiagnostico1;
    private String codCie2;
    private String nomDiagnostico2;
    private String codCie3;
    private String nomDiagnostico3;
    private String codCie4;
    private String nomDiagnostico4;
    private String codCie5;
    private String nomDiagnostico5;
    private String codCie6;
    private String nomDiagnosticoEgreso;
    private String Uci;

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

    public LocalDateTime getFecha_Egreso() {
        return Fecha_Egreso;
    }

    public void setFecha_Egreso(LocalDateTime Fecha_Egreso) {
        this.Fecha_Egreso = Fecha_Egreso;
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

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getCodCie1() {
        return codCie1;
    }

    public void setCodCie1(String codCie1) {
        this.codCie1 = codCie1;
    }

    public String getNomDiagnostico1() {
        return nomDiagnostico1;
    }

    public void setNomDiagnostico1(String nomDiagnostico1) {
        this.nomDiagnostico1 = nomDiagnostico1;
    }

    public String getCodCie2() {
        return codCie2;
    }

    public void setCodCie2(String codCie2) {
        this.codCie2 = codCie2;
    }

    public String getNomDiagnostico2() {
        return nomDiagnostico2;
    }

    public void setNomDiagnostico2(String nomDiagnostico2) {
        this.nomDiagnostico2 = nomDiagnostico2;
    }

    public String getCodCie3() {
        return codCie3;
    }

    public void setCodCie3(String codCie3) {
        this.codCie3 = codCie3;
    }

    public String getNomDiagnostico3() {
        return nomDiagnostico3;
    }

    public void setNomDiagnostico3(String nomDiagnostico3) {
        this.nomDiagnostico3 = nomDiagnostico3;
    }

    public String getCodCie4() {
        return codCie4;
    }

    public void setCodCie4(String codCie4) {
        this.codCie4 = codCie4;
    }

    public String getNomDiagnostico4() {
        return nomDiagnostico4;
    }

    public void setNomDiagnostico4(String nomDiagnostico4) {
        this.nomDiagnostico4 = nomDiagnostico4;
    }

    public String getCodCie5() {
        return codCie5;
    }

    public void setCodCie5(String codCie5) {
        this.codCie5 = codCie5;
    }

    public String getNomDiagnostico5() {
        return nomDiagnostico5;
    }

    public void setNomDiagnostico5(String nomDiagnostico5) {
        this.nomDiagnostico5 = nomDiagnostico5;
    }

    public String getCodCie6() {
        return codCie6;
    }

    public void setCodCie6(String codCie6) {
        this.codCie6 = codCie6;
    }

    public String getNomDiagnosticoEgreso() {
        return nomDiagnosticoEgreso;
    }

    public void setNomDiagnosticoEgreso(String nomDiagnosticoEgreso) {
        this.nomDiagnosticoEgreso = nomDiagnosticoEgreso;
    }

    public String getUci() {
        return Uci;
    }

    public void setUci(String Uci) {
        this.Uci = Uci;
    }
}