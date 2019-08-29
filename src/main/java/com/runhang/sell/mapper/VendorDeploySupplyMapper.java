package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorDeploySupply;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorDeploySupplyMapper {
    List<VendorDeploySupply> selectReplenisherByDeployId(@Param("deployId")Integer deployId);
}