package com.fincatto.documentofiscal.cte300.transformes;

import com.fincatto.documentofiscal.cte300.classes.CTTipoNavegacao;
import org.simpleframework.xml.transform.Transform;

public class CTTipoNavegacaoTransformer implements Transform<CTTipoNavegacao> {

    @Override
    public CTTipoNavegacao read(String arg0) {
		return CTTipoNavegacao.valueOfCodigo(arg0);
	}

    @Override
    public String write(CTTipoNavegacao arg0) {
		return arg0.getCodigo();
	}
}
