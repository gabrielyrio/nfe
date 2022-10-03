
package com.fincatto.documentofiscal.cte300.classes;

/**
 *
 * @author gabriel
 */
public enum CTRegimeTributario {
    
    SIMPLES_NACIONAL("1", "Simples nacional"),
    SIMPLES_NACIONAL_EXCESSO_RECEITA("2", "Simples nacional com excesso de sublimite da receita bruta"),
    NORMAL("3", "Regime normal");

    private final String codigo;
    private final String descricao;

    CTRegimeTributario(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CTRegimeTributario valueOfCodigo(final String codigo) {
        for (final CTRegimeTributario regimeTributario : CTRegimeTributario.values()) {
            if (regimeTributario.getCodigo().equals(codigo)) {
                return regimeTributario;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }    
    
}
