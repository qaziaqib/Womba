@smoketest
Feature: Search feature


Scenario Outline: Womba applicant filter should work
When Login to Womba
And Check womba applicant filter Firstname "<Firstname>" LastNme "<Lastname>" dob "<Dob>" Status "<Status>" RequesterCaseID "<RequesterCaseID>" tarcking no "<TrackingNo>"CompanyName "<CompanyName>" AdditionalConsent "<AdditionalConsent>" State "<State>" Datasource "<Datasource>" Filterdates "<Filterdates>" StartDate "<StartDate>" EndDate "<EndDate>"
Examples:
|Firstname|Lastname|Dob|Status|RequesterCaseID|TrackingNo|CompanyName|AdditionalConsent|State|Datasource|Filterdates|StartDate|EndDate|
|OneUpTest|Patient|03041994|Requested|null|HSX10251|1861 Wealth Advisors|Special Release|Null|ONE_UP_HEALTH|Date Requested|Null|Null|

