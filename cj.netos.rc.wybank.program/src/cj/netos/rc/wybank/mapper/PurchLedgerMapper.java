package cj.netos.rc.wybank.mapper;

import cj.netos.rc.wybank.model.PurchLedger;
import cj.netos.rc.wybank.model.PurchLedgerExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchLedgerMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PurchLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PurchLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PurchLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PurchLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PurchLedger> selectByExample(PurchLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PurchLedger selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") PurchLedger record, @Param("example") PurchLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") PurchLedger record, @Param("example") PurchLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PurchLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PurchLedger record);

    List<PurchLedger> pageLedger(@Param(value = "bankid") String bankid, @Param(value = "limit") int limit, @Param(value = "offset") int offset);

}