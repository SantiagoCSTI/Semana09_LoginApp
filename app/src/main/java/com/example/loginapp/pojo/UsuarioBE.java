
package com.example.loginapp.pojo;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsuarioBE implements Serializable, Parcelable
{

    @SerializedName("CodigoUsuario")
    @Expose
    private Integer codigoUsuario;
    @SerializedName("LoginUsuario")
    @Expose
    private String loginUsuario;
    @SerializedName("Nombres")
    @Expose
    private String nombres;
    @SerializedName("Correo")
    @Expose
    private String correo;
    @SerializedName("ContraseniaUsuario")
    @Expose
    private String contraseniaUsuario;
    @SerializedName("Eliminado")
    @Expose
    private Boolean eliminado;
    @SerializedName("CodigoError")
    @Expose
    private Integer codigoError;
    @SerializedName("DescripcionError")
    @Expose
    private String descripcionError;
    @SerializedName("MensajeError")
    @Expose
    private Object mensajeError;
    public final static Creator<UsuarioBE> CREATOR = new Creator<UsuarioBE>() {


        @SuppressWarnings({
            "unchecked"
        })
        public UsuarioBE createFromParcel(Parcel in) {
            return new UsuarioBE(in);
        }

        public UsuarioBE[] newArray(int size) {
            return (new UsuarioBE[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2049884435332009555L;

    protected UsuarioBE(Parcel in) {
        this.codigoUsuario = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.loginUsuario = ((String) in.readValue((String.class.getClassLoader())));
        this.nombres = ((String) in.readValue((String.class.getClassLoader())));
        this.correo = ((String) in.readValue((String.class.getClassLoader())));
        this.contraseniaUsuario = ((String) in.readValue((String.class.getClassLoader())));
        this.eliminado = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.codigoError = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.descripcionError = ((String) in.readValue((String.class.getClassLoader())));
        this.mensajeError = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public UsuarioBE() {
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Integer getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(Integer codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public Object getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(Object mensajeError) {
        this.mensajeError = mensajeError;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(codigoUsuario);
        dest.writeValue(loginUsuario);
        dest.writeValue(nombres);
        dest.writeValue(correo);
        dest.writeValue(contraseniaUsuario);
        dest.writeValue(eliminado);
        dest.writeValue(codigoError);
        dest.writeValue(descripcionError);
        dest.writeValue(mensajeError);
    }

    public int describeContents() {
        return  0;
    }

}
