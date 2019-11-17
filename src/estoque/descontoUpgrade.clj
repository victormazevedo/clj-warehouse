(ns estoque.descontoUpgrade)



(println (valor-descontado 1000))

(println (valor-descontado 100))

;PREDICATE FUNCTION
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))

;clojure faz o binding em tempo de execuç�o e n�o compilaç�o
(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(defn aplica-desconto?
  [valor-bruto]
  (println "chamando a versao redefinida")
  (if (> valor-bruto 100)
    true))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))
(println (valor-descontado 1000))
(println (valor-descontado 100))
