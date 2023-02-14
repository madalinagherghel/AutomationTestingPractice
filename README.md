# Proiect Final AQA 
Proiectul are urmatoarea structura:
<ul>
<li>Am creat in main->resources un folder cu drivere pentru partea de frontend si 2 properties file (unul pentru frontend si unul pentru backend).</li>
<li>In main->java->frontendConfigs : Un reader pentru properties si DriverFactory pentru a alege browser-ul cu care rulez testele</li>
<li>In main->java->backendConfigs: Reader pentru backend properties.</li>
<li>Am creat 2 packages separate pentru partea de backend si frontend in src->test->java</li>
<li>Pentru frontend am impartit in: locators, pageObjects si steps.</li>
<li>Pentru backend: apiEngine (endpoints-metode pentru fiecare tip de metode http, request-pentru request body cu POJO class,routes) si steps.</li>
<li>O clasa Hooks care deschide si inchide browserul.</li>
<li>Un Runner comun pentru backend si frontend.</li>
<li>In src->test->resources featureFiles.</li>
</ul>

