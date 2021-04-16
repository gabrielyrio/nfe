package com.fincatto.documentofiscal.cte300.classes;

public enum CTTipoNavegacao {

    NAVEGACAO_INTERIOR("0", "Interior"),
    NAVEGACAO_CABOTAGEM("1", "Cabotagem");

    private final String codigo;
    private final String descricao;

    CTTipoNavegacao(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CTTipoNavegacao valueOfCodigo(final String codigo) {
        for (final CTTipoNavegacao tipo : CTTipoNavegacao.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}
