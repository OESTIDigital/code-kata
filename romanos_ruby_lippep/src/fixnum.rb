require_relative "roman"

class Fixnum
	def to_roman
		n = self
		roman = ""

		Roman.mapping.each do |value, letter|
			roman << letter*(n / value)
			n = n % value
		end

		roman
	end
end