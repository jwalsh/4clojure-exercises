(ns exercises-4clojure.core)

; 21
(defn nth-element-solution [l n]
  (first (drop n l))
  )

; 20
(defn penultimate-element-solution [l] 
  (second (reverse l))
)
