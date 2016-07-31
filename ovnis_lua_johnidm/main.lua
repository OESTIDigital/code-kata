require "math"

function retorna_numero_por_letra(letra)
	local letras = {A=1, B=2, C=3, D=4, E=5, F=6, G=7, H=8, I=9, J=10, K=11, L=12, M=13, N=14, O=15, P=16, Q=17, R=18, S=19, T=20, U=21, V=22, W=23, X=24, Y=25, Z=26}
    return letras[letra]
end

function calcula_produto_letra(palavra)   
	
	primeira_palavra = string.sub(palavra, 1, 1)
    local produto = retorna_numero_por_letra(primeira_palavra)

    for i = 2, string.len(palavra) do
        local letra = string.sub(palavra, i, i)
        produto = produto * retorna_numero_por_letra(letra)
    end

    return produto
end

function retornar_resto_45(numero)
    return math.fmod(numero, 45)
end

local grupo = {"HALLEY", "ENCKE", "WOLF", "KUSHIDA"}
local cometa = {"AMARELO", "VERMELHO", "PRETO",  "AZUL"}

for i=1,4 do

    local total_produto_grupo = calcula_produto_letra(grupo[i])
    local total_produto_cometa = calcula_produto_letra(cometa[i])
    
    local sera_levado = retornar_resto_45(total_produto_cometa) == retornar_resto_45(total_produto_grupo)
    
    if sera_levado then
       print("O grupo " .. grupo[i] .. " será levado")
    else
       print("O grupo " .. grupo[i] .. " NÃO será levado")    
    end 
end


