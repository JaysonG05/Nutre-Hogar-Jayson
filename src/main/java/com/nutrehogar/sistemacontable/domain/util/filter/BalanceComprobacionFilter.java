package com.nutrehogar.sistemacontable.domain.util.filter;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Clase sellada que define los criterios de filtrado para el Balance de Comprobación.
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public sealed abstract class BalanceComprobacionFilter permits BalanceComprobacionFilter.ByCodigoCuenta, BalanceComprobacionFilter.ByNombreCuenta, BalanceComprobacionFilter.All {

    /**
     * Filtra el Balance de Comprobación por código de cuenta.
     */
    @Getter
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    public static final class ByCodigoCuenta extends BalanceComprobacionFilter {
        String codigoCuenta;
    }

    /**
     * Filtra el Balance de Comprobación por nombre de cuenta.
     */
    @Getter
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    public static final class ByNombreCuenta extends BalanceComprobacionFilter {
        String nombreCuenta;
    }

    /**
     * Representa la opción de no aplicar ningún filtro al Balance de Comprobación.
     */
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class All extends BalanceComprobacionFilter {
        public static final All INSTANCE = new All();
    }
}