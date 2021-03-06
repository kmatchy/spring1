package com.example.spring1.infrastructure.mybatis;

import com.example.spring1.infrastructure.mybatis.AccountManagement;
import com.example.spring1.infrastructure.mybatis.AccountManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountManagementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    long countByExample(AccountManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int deleteByExample(AccountManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int insert(AccountManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int insertSelective(AccountManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    List<AccountManagement> selectByExample(AccountManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    AccountManagement selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int updateByExampleSelective(@Param("record") AccountManagement record, @Param("example") AccountManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int updateByExample(@Param("record") AccountManagement record, @Param("example") AccountManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int updateByPrimaryKeySelective(AccountManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account_management
     *
     * @mbg.generated Mon Jul 08 22:42:28 JST 2019
     */
    int updateByPrimaryKey(AccountManagement record);
}