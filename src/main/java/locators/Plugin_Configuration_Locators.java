package locators;

public interface Plugin_Configuration_Locators extends Predictable_Activity_Locators{

	public static String Plugin_module_id="Plugin_module_id>//input[@aria-label='Module ID Filter Input']";
	public static String Plugin_id="Plugin_id>//input[@aria-label='Plugin ID Filter Input']";
	public static String plugin_row_Click="plugin_row_Click>//div[@ref='eBodyViewport']//preceding::div[@row-index='0']";
	public static String enable_status="enable_status>//label[contains(@id,'PGC-column')]";
	public static String pluginConfiguration_Tab = "pluginConfiguration_Tab>//a[@role='presentation']/child::label[.='Plugin Configuration']";
	public static String retrieved_PluginID = "retrieved_PluginID>//div[@ref='eCenterContainer']//following::div[@col-id='column2' and @role='gridcell']";
	public static String pluginConf_Toolbar_Edit = "plugpluginConfiguration_TabinConf_Toolbar_Edit>//button[@id='PGC-PGC_toolbar-btnTblEdit']";
	public static String pluginIdFilter_Searchbox = "pluginIdFilter_Searchbox>//input[@aria-label='Plugin ID Filter Input']";
	public static String moduleIdFilter_Searchbox = "moduleIdFilter_Searchbox>//input[@aria-label='Module ID Filter Input']";
	public static String pluginStatus_Select = "pluginStatus_Select>//ul[@id='PGC-column4_items']/child::li[@data-label='%s']";
	public static String plugin_Toolbar_Save = "plugin_Toolbar_Save>//button[@id='PGC-PGC_toolbar-btnsave']";
	public static String Condition_Dropdown = "Condition_Dropdown>//label[@id='PGC-column4_label']";



}
