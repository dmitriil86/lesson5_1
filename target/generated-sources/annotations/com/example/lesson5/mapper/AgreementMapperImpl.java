package com.example.lesson5.mapper;

import com.example.lesson5.dto.instanceArrangementDto;
import com.example.lesson5.model.Agreement;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class AgreementMapperImpl implements AgreementMapper {

    @Override
    public Agreement toAgreement(instanceArrangementDto instanceArrangementDto) {
        if ( instanceArrangementDto == null ) {
            return null;
        }

        Agreement agreement = new Agreement();

        agreement.setNumber( instanceArrangementDto.getNumber() );
        agreement.setGeneralAgreementId( instanceArrangementDto.getGeneralAgreementId() );
        agreement.setSupplementaryAgreementId( instanceArrangementDto.getSupplementaryAgreementId() );
        agreement.setArrangementType( instanceArrangementDto.getArrangementType() );
        if ( instanceArrangementDto.getShedulerJobId() != null ) {
            agreement.setShedulerJobId( instanceArrangementDto.getShedulerJobId().longValue() );
        }
        if ( instanceArrangementDto.getOpeningDate() != null ) {
            agreement.setOpeningDate( new Timestamp( instanceArrangementDto.getOpeningDate().getTime() ) );
        }
        if ( instanceArrangementDto.getClosingDate() != null ) {
            agreement.setClosingDate( new Timestamp( instanceArrangementDto.getClosingDate().getTime() ) );
        }
        if ( instanceArrangementDto.getCancelDate() != null ) {
            agreement.setCancelDate( new Timestamp( instanceArrangementDto.getCancelDate().getTime() ) );
        }
        if ( instanceArrangementDto.getValidityDuration() != null ) {
            agreement.setValidityDuration( instanceArrangementDto.getValidityDuration().longValue() );
        }
        agreement.setCancellationReason( instanceArrangementDto.getCancellationReason() );
        agreement.setStatus( instanceArrangementDto.getStatus() );
        if ( instanceArrangementDto.getInterestCalculationDate() != null ) {
            agreement.setInterestCalculationDate( new Timestamp( instanceArrangementDto.getInterestCalculationDate().getTime() ) );
        }
        if ( instanceArrangementDto.getInterestRate() != null ) {
            agreement.setInterestRate( BigDecimal.valueOf( instanceArrangementDto.getInterestRate() ) );
        }
        if ( instanceArrangementDto.getCoefficient() != null ) {
            agreement.setCoefficient( BigDecimal.valueOf( instanceArrangementDto.getCoefficient() ) );
        }
        agreement.setCoefficientAction( instanceArrangementDto.getCoefficientAction() );
        if ( instanceArrangementDto.getMinimumInterestRate() != null ) {
            agreement.setMinimumInterestRate( BigDecimal.valueOf( instanceArrangementDto.getMinimumInterestRate() ) );
        }
        if ( instanceArrangementDto.getMinimumInterestRateCoefficient() != null ) {
            agreement.setMinimumInterestRateCoefficient( new BigDecimal( instanceArrangementDto.getMinimumInterestRateCoefficient() ) );
        }
        agreement.setMinimumInterestRateCoefficientAction( instanceArrangementDto.getMinimumInterestRateCoefficientAction() );
        agreement.setMaximalInterestRate( instanceArrangementDto.getMaximalInterestRate() );
        agreement.setMaximalInterestRateCoefficient( instanceArrangementDto.getMaximalInterestRateCoefficient() );
        agreement.setMaximalInterestRateCoefficientAction( instanceArrangementDto.getMaximalInterestRateCoefficientAction() );

        return agreement;
    }

    @Override
    public List<Agreement> toAgreementList(List<instanceArrangementDto> instanceArrangementDto) {
        if ( instanceArrangementDto == null ) {
            return null;
        }

        List<Agreement> list = new ArrayList<Agreement>( instanceArrangementDto.size() );
        for ( instanceArrangementDto instanceArrangementDto1 : instanceArrangementDto ) {
            list.add( toAgreement( instanceArrangementDto1 ) );
        }

        return list;
    }
}
