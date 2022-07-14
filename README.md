# IDE-UI-DESIGNER

# PREVIEW

![exemplo](https://miro.medium.com/focal/1200/900/50/50/1*KfcF7k1U8FpV_MOQIfx4lQ@2x.png)

O objetivo aqui é bem simples, utilizando o editor de layout do sketchware é do android studio como base.
a meta é construir um editor de layout linpo é bonito para ser usado por desenvolvedores mobile, tanto pelos usuarios do aide como outras plataformas de edição de codigo.
há no mento 2 problemas essenciais a ser superado alem da minha falta de conhecimento,

# numero um

como podem ver no codigo a baixo é um codigo java pra mostra o conteudo de uma pasta específica mas por algum motivo nao mostra nada por isso as partas comentadas no fim do codigo.

https://github.com/FSILVA143/IDE-UI-DESIGNER/blob/master/app/src/main/java/com/fabiosilva/ideuidesigner/MainActivity.java

# numero dois

como vocês podem ver no link abaixo o código é basicamente a alma do aplicativo utilizando um drive drop para puxar os widgets que queremos para a área de edição,
esse código ainda está longe de estar pronto tendo apenas o esqueleto digamos assim em uma direção a lógica aqui é usar Canvas para gerar os layouts visivelmente para os usuários e que cada desenho gerado possa ser movimentado pela tela
podendo assim colocar linear dentro de linear imagem dentro de linear e assim por diante, levando em conta que cada widget terá seus atributos únicos como altura, largura no caso das imagens uma imagem ou um caminho selecionado pelo usuário
podemos trabalhar com Jason para armazenar as informações de localização de cada widget na tela para só então depois converter o próprio Jason para um XML que pode ser lido pelo id pelo Android Studio ou qualquer outra engine de edição que hoje o XML como padrão.

https://github.com/FSILVA143/IDE-UI-DESIGNER/blob/master/app/src/main/java/com/fabiosilva/ideuidesigner/StudioActivity.java

# Canvas
https://github.com/Korilakkuma/CanvasView

# Json para Xml
https://github.com/smart-fun/XmlToJson

temos que levar em consideração que projetos externos podem ser indexados para edição então teremos que transformar o XML para de json novamente

# Xml para Json
https://github.com/smart-fun/XmlToJson


# UMA IDEIA
bom pra iniciar é ficar facil de entender eu pretendo gravar um pequeno video em velocidade rapida da construção dos layouts do usuários.
afim de criar uma rede social de video como tik tok. mostrando os layouts feitos por usuários. claro vamos ter uma marketplace para a comercialização de templates