package com.herprogramacion.iwish.tools;

/**
 * Clase que contiene los códigos usados en "I Wish" para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */
public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;
    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica ":63343";.
     */
    //private static final String PUERTO_HOST = "";
    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "gestioneventos.000webhostapp.com";
    /**
     * URLs del Web Service
     */

    public static final String GET = "https://" + IP + "/obtener_metas.php";
    public static final String GET_BY_ID = "https://" + IP + "/obtener_meta_por_id.php";
    public static final String UPDATE = "https://" + IP + "/actualizar_meta.php";
    public static final String DELETE = "https://" + IP + "/borrar_meta.php";
    public static final String INSERT = "https://" + IP + "/insertar_meta.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}
