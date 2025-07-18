package com.elane.response;

import lombok.Data;

@Data
public class GetSingleETAPreciseData {
    private SingleETAShipInfo ship;
    private SingleETALocationInfo location;
    private SingleETAPortInfo preport;
    private SingleETANextPortInfo nextport;
}
