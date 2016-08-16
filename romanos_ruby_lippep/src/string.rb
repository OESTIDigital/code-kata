require_relative "roman"

class String 
    def to_arabic
        result = 0
        str = self

        Roman.MAPPING.values.each do |roman|
            while str.start_with?(roman)
                result += Roman.MAPPING.invert[roman]
                str = str.slice(roman.length, str.length)
            end
        end

        result
    end
end