package ar.edu.ubp.das.supermercadorest.bean;

import java.math.BigDecimal;

public class ListaPrecios {
    private String cod_barra;
    private String nom_producto;
    private String precio;
    private String nomCategoria;
    private String nro_sucursal;
    private String cod_barra_prod_sustituto;


    public String getCod_barra() {
        return cod_barra;
    }

    public void setCod_barra(String cod_barra) {
        this.cod_barra = cod_barra;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getNro_sucursal() {
        return nro_sucursal;
    }

    public void setNro_sucursal(String nro_sucursal) {
        this.nro_sucursal = nro_sucursal;
    }

    public String getCod_barra_prod_sustituto() {
        return cod_barra_prod_sustituto;
    }

    public void setCod_barra_prod_sustituto(String cod_barra_prod_sustituto) {
        this.cod_barra_prod_sustituto = cod_barra_prod_sustituto;
    }
}
