package com.fincatto.documentofiscal.cte300.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.classes.nota.assinatura.CTeSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Tipo Conhecimento de Transporte Eletrônico (Modelo 57)
 * Atualizado por Gabriel Cruz Lyrio 16-04-2021
 * adicionado atributo: CTeNotaInfoSuplementares
 */

@Root(name = "CTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNota extends DFBase {
    private static final long serialVersionUID = -3697915253635990400L;
    
    @Element(name = "infCte")
    private CTeNotaInfo info;
    
    
    @Element(name = "infCTeSupl", required = false)
    private CTeNotaInfoSuplementares infoSuplementares;

    @Element(name = "Signature", required = false)
    private CTeSignature signature;

    public CTeNota() {
        this.info = null;
        this.signature = null;
        this.infoSuplementares = null;
    }

    public CTeNotaInfo getCteNotaInfo() {
        return this.info;
    }

    public void setCteNotaInfo(final CTeNotaInfo info) {
        this.info = info;
    }

    public CTeSignature getSignature() {
        return this.signature;
    }

    public void setSignature(final CTeSignature signature) {
        this.signature = signature;
    }

    public CTeNotaInfoSuplementares getInfoSuplementares() {
        return infoSuplementares;
    }

    public void setInfoSuplementares(CTeNotaInfoSuplementares infoSuplementares) {
        this.infoSuplementares = infoSuplementares;
    }

    public CTeNotaInfo getInfo() {
        return info;
    }

    public void setInfo(CTeNotaInfo info) {
        this.info = info;
    }
    
    
}
