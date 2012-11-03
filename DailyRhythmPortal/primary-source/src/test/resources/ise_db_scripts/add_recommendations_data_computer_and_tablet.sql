SET MODE Oracle;

INSERT INTO BST_ISE_SCH01.RECOMMENDATION(
	RECOMMENDATION_ID,
	DEVICE_CAPABILITIES,
	WOW_REQUIREMENTS,
	RECOMMENDED_SUBSCRIPTION,
	RECOMMENDED_DEVICE,
	NET_USE_INFO,
	NOTES,
	CREATED_BY,
	CREATED_ON,
	AMENDED_BY,
	AMENDED_ON,
	STORE_ID,
	EMP_CONTACT,
	FIRST_NAME,
	LAST_NAME,
	MOBILE_NO,
	BEST_CONTACT_TM_INFO,
	BBY_CUSTOMER_ID,
	UPGRADE_REMINDER_TEXT,
	UPGRADE_REMINDER_CALL,
	UPGRADE_ELIGIBILITY_DATE,
	SUBSCRIPTION_INFO,
	TRADE_IN_VAL,
	EMP_CRT_FRST_NM,
	EMP_CRT_LAST_NM,
	EMP_ALT_FRST_NM,
	EMP_ALT_LAST_NM,
	REC_SHT_TYP,
	ADDR,
    CITY,
    STATE,
    ZIPCODE,
    BBY_CNS_FRST_NM,
    BBY_CNS_LAST_NM,
    BBY_CNS_PH_NBR,
    BBY_CNS_PH_EXT)
values(
	1,
	0,
	0,
	'someRecommendedSubscription',
	'someRecommendedDevice',
	'someNetUseInfo',
	'someNotes',
	'a123',
	SYSDATE,
	null,
	null,
	'0644',
	'someSpecialistContactInfo',
	'someFirstName',
	'someLastName',
	'5551111111',
	'someBestTimeToContact',
	'someBbyCustomerId',
	null,
	1,
	null,
	'someSubscriptionInfo',
	111.23,
	'someEmpCreateFirstName',
	'someEmpCreateLastName',
	null,
	null,
	2,
	'someAddress',
	'someCity',
	'someState',
	'55435',
	'someBbyConsultantFirstName',
	'someBbyConsultantLastName',
	'6126126122',
	'1234');


INSERT INTO BST_ISE_SCH01.RECOMMENDATION(
	RECOMMENDATION_ID,
	DEVICE_CAPABILITIES,
	WOW_REQUIREMENTS,
	RECOMMENDED_SUBSCRIPTION,
	RECOMMENDED_DEVICE,
	NET_USE_INFO,
	NOTES,
	CREATED_BY,
	CREATED_ON,
	AMENDED_BY,
	AMENDED_ON,
	STORE_ID,
	EMP_CONTACT,
	FIRST_NAME,
	LAST_NAME,
	MOBILE_NO,
	BEST_CONTACT_TM_INFO,
	BBY_CUSTOMER_ID,
	UPGRADE_REMINDER_TEXT,
	UPGRADE_REMINDER_CALL,
	UPGRADE_ELIGIBILITY_DATE,
	SUBSCRIPTION_INFO,
	TRADE_IN_VAL,
	EMP_CRT_FRST_NM,
	EMP_CRT_LAST_NM,
	EMP_ALT_FRST_NM,
	EMP_ALT_LAST_NM,
	REC_SHT_TYP)
values(
	2,
	0,
	0,
	null,
	null,
	null,
	null,
	'a234',
	SYSDATE,
	null,
	null,
	'0655',
	null,
	null,
	'someOtherLastName',
	'5552222222',
	null,
	null,
	null,
	null,
	null,
	null,
	null,
	null,
	null,
	null,
	null,
	2);