## Solução do problema com Ruby.

Adicionei comportamentos as classes String e Fixnum, sendo a seguinte lógica:
- caso for informado um número romano, é string (ex: X)
- caso for informado um número arábico, é feito a conversão para int (ex: 10)

A classe Conversor serve apenas para identificar e delegar qual a conversão correta

## Para executar

ruby app.rb