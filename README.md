# web_challange_renner

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")

### Arquitetura - Execução dos testes
Para execução dos testes, utilizamos classe JUnit, em conjunto com anotações do CucumberOptions para facilitar a criação de suítes de testes com diferentes configurações.

Para executar o teste, basta clicar com o botão direito sobre a classe, e selecionar "Run <NomeDaClasseDeExecucao>". É possível executar com maven também, através do comando: `mvn test -Dtest=NomeDaClasseDeExecucao`
