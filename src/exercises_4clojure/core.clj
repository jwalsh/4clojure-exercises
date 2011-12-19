(ns exercises-4clojure.core)

;; 21
(defn nth-element-solution [l n]
  (first (drop n l)))

;; 20
(defn penultimate-element-solution [l] 
  (second (reverse l)))

;; 34
;; Write a function which creates a list of all integers in a given range.
(defn implement-range-solution [s e] ; Update args as needed!
  (range s e))

;; 27
;; Write a function which returns true if the given sequence is a palindrome.
(defn palindrome-detector-solution [l] ; Update args as needed!
  (= (seq l) (reverse l)))
