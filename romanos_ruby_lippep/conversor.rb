require_relative "string"
require_relative "fixnum"

class Conversor
	attr_reader :numero

	def initialize(numero)
		@numero = numero
	end

	def romano?
		/^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/.match(@numero)
	end

	def converte
		if romano?
			return numero.to_arabic
		else
		    return numero.to_i.to_roman
		end
	end
end