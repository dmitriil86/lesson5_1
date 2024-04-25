package com.example.lesson5.mapper;

import com.example.lesson5.dto.RequestProductReq;
import com.example.lesson5.model.TppProduct;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class TppProductMapperImpl implements TppProductMapper {

    @Override
    public TppProduct toTppProduct(RequestProductReq req) {
        if ( req == null ) {
            return null;
        }

        TppProduct tppProduct = new TppProduct();

        tppProduct.setProductCodeId( req.getProductCode() );
        if ( req.getMdmCode() != null ) {
            tppProduct.setClientId( Long.parseLong( req.getMdmCode() ) );
        }
        tppProduct.setType( req.getProductType() );
        tppProduct.setNumber( req.getContractNumber() );
        if ( req.getContractDate() != null ) {
            tppProduct.setDateOfConclusion( new Timestamp( req.getContractDate().getTime() ) );
        }
        if ( req.getContractDate() != null ) {
            tppProduct.setStartDateTime( new Timestamp( req.getContractDate().getTime() ) );
        }
        if ( req.getTaxPercentageRate() != null ) {
            tppProduct.setTax_rate( BigDecimal.valueOf( req.getTaxPercentageRate() ) );
        }
        if ( req.getPriority() != null ) {
            tppProduct.setPriority( req.getPriority().longValue() );
        }
        if ( req.getThresholdAmount() != null ) {
            tppProduct.setThresholdAmount( BigDecimal.valueOf( req.getThresholdAmount() ) );
        }

        return tppProduct;
    }
}
