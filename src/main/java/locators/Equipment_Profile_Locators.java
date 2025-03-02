package locators;

public interface Equipment_Profile_Locators extends Global_Activity_Mapping_Locators {
	// TS-057 & TS-059
		public static String eqpNoTextField_L = "eqpNoTextField>//input[@id='CNP-CNP_txtcontainernoNew']";

		public static String tareWeightTextField_L = "tareWeightTextField>//input[@id='CNP-CNP_txttarewght_input']";
		public static String tareWeightTextField1_L = "tareWeightTextField1>//span[@id='CNP-CNP_txttarewght']";
		public static String payLoadTextField_L = "payLoadTextField>//input[@id='CNP-CNP_txtpayload_input']";
		public static String maxGrossWeightTextField_L = "maxGrossWeightTextField>//input[@id='CNP-CNP_txtgrosswght_input']";
		public static String saveButtonEqpPro_L = "saveButtonEqpPro_L>//button[@id='CNP-CNP_toolbar-btnsave']";
		public static String editButtonEqpPro_L = "editButtonEqpPro>//button[@id='CNP-CNP_toolbar-btnTblEdit']";
		public static String globalSearchEqpPro_L = "globalSearchEqpPro>//button[@id='CNP-CNP_toolbar-btnTblJdlgSearch']";
		public static String eqpNoSearchField_L = "eqpNoSearhField>//input[@id='txt_name1']";
		public static String eqpProfileSearchFrame_L = "eqpProfileSearchFrame>//div[@id='nfr_sch_jdlg']";
		public static String eqProSearchButton_L = "eqProSearchButton>//button[@id='myBtn']";
		public static String selFirstEqPro_L = "selFirstEqPro>//div[@row-id='0']/child::div[@col-id='C1']";
		public static String selectButtonEqPro_L = "selectButtonEqPro>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";


		public static String EquipNo_Field="EquipNo_Field>(//div[@id='search_JDLGView']//following::input[1])[1]";
		public static String EqpProfilePage_L = "EqpProfilePage_L>//a/label[.='Equipment Profile']";

		public static String nominalCubic_Textfield="nominalCubic_Textfield>//input[@id='CNP-CNP_txtnomcubcity_input']";
		public static String stackHeight_Textfield="stackHeight_Textfield>//input[@id='CNP-CNP_txtstkhgt']";
		public static String grossStacking_Textfield="grossStacking_Textfield>//input[@id='CNP-CNP_txtstcwght']";
		public static String injectionPort_Dropdown="injectionPort_Dropdown>//label[@id='CNP-CNP_cmbinjectionPort_label']";
		public static String domcile_Searchfield="domcile_Searchfield>//input[@id='CNP-CNP_txtdomicileprt']";
		public static String eqpStatus_Dropdown="eqpStatus_Dropdown>//label[@id='CNP-CNP_txtstatus_label']";
		public static String contractId1_Textfield="contractId1_Textfield>//input[@id='CNP-CNP_txtContrctload']";
		public static String contractId2_Textfield="contractId2_Textfield>//input[@id='CNP-CNP_txtcontrcload1']";
		public static String contractId3_Textfield="contractId3_Textfield>//input[@id='CNP-CNP_txtcontrcload2']";
		public static String onHireDate_Textfield="onHireDate_Textfield>//input[@id='CNP-CNP_txtONHI_input']";
		public static String redeliveryPort_Searchfield="redeliveryPort_Searchfield>//input[@id='CNP-CNP_txtREDLprt']";
		public static String redeliveryDate_Textfield="redeliveryDate_Textfield>//input[@id='CNP-CNP_txtREDDDATE_input']";
		public static String leasingRefNo_Textfield="leasingRefNo_Textfield>//input[@id='CNP-CNP_txtleasingrefno']";
		public static String leasingContractRef_Textfield="leasingContractRef_Textfield>//input[@id='CNP-CNP_txtleasingcontrref']";
		public static String subleaseContract_Textfield="subleaseContract_Textfield>//input[@id='CNP-CNP_txtcontrctno']";
		public static String supplierContract_Textfield="supplierContract_Textfield>//input[@id='CNP-CNP_txtsupcont']";
		public static String lessorCode_Dropdown="lessorCode_Dropdown>//label[@id='CNP-CNP_cmblessorcode_label']";
		public static String lesseeCode_Dropdown="lesseeCode_Dropdown>//label[@id='CNP-CNP_cmbleasecode_label']";
		public static String sublease_Dropdown="lesseeCode_Dropdown>//label[@id='CNP-CNP_cmbsublease_label']";
		public static String perDiem_Textfield="perDiem_Textfield>//input[@id='CNP-CNP_txtintperdiem']";
		public static String leaseKind_Dropdown2="leaseKind_Dropdown2>//label[@id='CNP-CNP_cmbleasekind_label']";
		public static String leaseTerm_Dropdown2="leaseTerm_Dropdown2>//label[@id='CNP-CNP_cmbleaseterm_label']";
		public static String leaseKind_Dropdown3="leaseKind_Dropdown3>//label[@id='CNP-CNP_cmbleasekind1_label']";
		public static String submittedToJoint="submittedToJoint>//label[@id='CNP-CNP_cmbjointvent_label']";



		// TS-058 & TS-061
		public static String newButtonEqPro_L = "newButtonEqPro>//button[@id='CNP-CNP_toolbar-btnTblNew']";
		public static String cancelButtonEqPro_L = "cancelButtonEqPro>//button[@id='CNP-CNP_toolbar-btnTblCancel']";
		public static String createConfirmPopup_L = "createConfirmPopup>//span[.=' Do you want to create a New Equipment Profile?']";
		public static String createConfirmPopupYes_L = "createConfirmPopupYes>//span[.=' Do you want to create a New Equipment Profile?']/following::button[.='Yes']";
		public static String eqpTypeDropDown_L = "eqpTypeDropDown>//div[@id='CNP-CNP_txtequiptype']";
		public static String selEqpType_L = "selEqpType>//li[@data-label='CONTAINER']";
		public static String sizeTypeDropDownEqPro_L = "sizeTypeDropDownEqPro>//div[@id='CNP-CNP_cmbsize']";
		public static String selSizeType_L = "selSizeType>//li[@data-label='20DC']";
		public static String isoDropDown_L = "isoDropDown>//label[@id='CNP-CNP_txtiso_label']";
		public static String sosDropDown_L = "sosDropDown>//div[@id='CNP-CNP_cmbsoc']";
		public static String selSos_L = "selSos>//ul[@id='CNP-CNP_cmbsoc_items']/li[@data-label='Y']";
		public static String eqpStatusDropDown_L = "eqpStatusDropDown>//label[@id='CNP-CNP_txtstatus_label']";
		public static String selActiveStatus_L = "selActiveStatus>//li[@data-label='ACTIVE']";
		public static String fleetGroupDropDown_L = "fleetGroupDropDown>//label[@id='CNP-CNP_cmbfleetgrp_label']";
		public static String selActiveFleet_L = "selActiveFleet>//li[@data-label='ACTIVE FLEET']";
		public static String deleteButtonEqpPro_L = "deleteButtonEqpPro>//button[@id='CNP-CNP_toolbar-btnTblDelete']";
		public static String wantToDeleteYes_L = "wantToDeleteYes>//span[.=' Do you want to delete the Equipment Profile?']/following::button[.='Yes']";
		public static String wantToDeletePopup_L = "wantToDeletePopup>//span[.=' Do you want to delete the Equipment Profile?']";
		public static String globalSearchCloseIcon_L = "globalSearchCloseIcon>//span[@id='nfr_sch_jdlg_title']/following-sibling::a[@aria-label='Close']";
		public static String cannotDeletePopup_L = "cannotDeletePopup>(//*[text()='Cannot delete the Equipment Profile. It has movement entry'])[1]";
		public static String eqpProfileDeletedPopup_L = "eqpProfileDeletedPopup>(//*[text()='Equipment Profile is deleted'])[1]";
		public static String eqpProfileSaved_L = "eqpProfileSaved>(//*[text()='Equipment Profile is saved'])[1]";
		public static String eqpProfileUpdatedPopup_L = "eqpProfileUpdatedPopup>(//*[text()='Equipment Profile is updated'])[1]";
		public static String eqpProNoFoundRecordsPopup_L = "eqpProNoFoundRecordsPopup>(//*[text()='No records Found'])[1]";
		public static String EqpSearchCloseButton_L = "EqpSearchCloseButton>//span[@id='nfr_sch_jdlg_title']/following-sibling::a[@aria-label='Close']";
		public static String alraedySavedPopup_L = "alraedySavedPopup>(//*[text()='Equipment Profile already exists in Container'])[1]";

		public static String onHireLocation_Searchfield="onHireLocation_Searchfield>//input[@id='CNP-CNP_txtonhire']";
		public static String contractRefNum_Textfield="contractRefNum_Textfield>//input[@id='CNP-CNP_txtconref']";
		public static String disposalRegNum="disposalRegNum>//input[@id='CNP-CNP_txtdispogregnoNew']";

		public static String payLoadTextField_2 = "payLoadTextField_2>//input[@id='CNP-CNP_txtpayload_hinput']";
		// TS-060
		public static String refreshButton_L = "refreshButton>//button[@id='CNP-CNP_btnrefresh']";
		public static String manufacturedDate_L = "manufacturedDate>//input[@id='CNP-CNP_DateManu_input']";
		public static String specialUnitDropDown_L = "specialUnitDropDown>//div[@id='CNP-CNP_cmbspecialUnit']";
		public static String specialUnitYes_L = "specialUnitYes>//li[@id='CNP-CNP_cmbspecialUnit_0']";
		public static String specialUnitNo_L = "specialUnitNo>//li[@id='CNP-CNP_cmbspecialUnit_1']";
		public static String ownedDropdown_L = "ownedDropdown>//div[@id='CNP-CNP_cmbowned']";
		public static String ownedY_L = "ownedY>//li[@id='CNP-CNP_cmbowned_0']";
		public static String ownedN_L = "ownedN>//li[@id='CNP-CNP_cmbowned_1']";
		
		public static String retrieved_Record = "retrieved_Record>//div[text()='%s' and @role='gridcell']";
		public static String equipment_Type = "equipmentType>//li[@data-label='%s']";
		public static String size_Type1 = "size_Type1>//li[@data-label='%s']";
		public static String soc_Input = "soc_Input>//ul[@id='CNP-CNP_cmbsoc_items']/li[@data-label='%s']";
		public static String specialUnit_field = "specialUnit>//ul[@id='CNP-CNP_cmbspecialUnit_items']/li[@data-label='%s']";
		public static String owned_field = "owned>//ul[@id='CNP-CNP_cmbowned_items']/li[@data-label='%s']";
		public static String injection_Port = "injectionPort>//ul[@id='CNP-CNP_cmbinjectionPort_items']/li[@data-label='%s']";
		public static String eqp_Status = "eqp_Status>//li[@data-label='%s']";
		public static String fleet_Group = "fleet_Group>//li[@data-label='%s']";
		public static String lessor_Code = "lessor_Code>//ul[@id='CNP-CNP_cmblessorcode_items']/li[@data-label='%s']";
		public static String lessee_Code = "lessee_Code>//ul[@id='CNP-CNP_cmbleasecode_items']/li[@data-label='%s']";
		public static String leaseKind_1 = "leaseKind_1>//ul[@id='CNP-CNP_cmbleasekind_items']/li[@data-label='%s']";
		public static String lease_Term = "leaseTerm>//ul[@id='CNP-CNP_cmbleaseterm_items']/li[@data-label='%s']";
		public static String leaseKind_2 = "leaseKind_2>//ul[@id='CNP-CNP_cmbleasekind1_items']/li[@data-label='%S']";
		public static String submittedToJoin_Venture = "submittedToJoin_Venture>//ul[@id='CNP-CNP_cmbjointvent_items']/li[@data-label='%S']";
		public static String EqpPopup="EqpPopup>//div[@id='lrp_cust_growl_container']//following::p";
}
