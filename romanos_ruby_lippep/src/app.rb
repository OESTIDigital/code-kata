# encoding: utf-8

require_relative "conversor"

puts "Bem vindo Elliot"
puts "Digite o número para conversão:"
numero = gets.strip

conversor = Conversor.new(numero)

puts "O resultado é:"
puts conversor.converte