(ns clojure-for-the-brave.chapter-3)

; 1. Use the str, vector, list, hash-map, and hash-set functions.
(defn exercise_1
  []
  (println (str "Hello, " "clojure"))
  (println (vector 1 2 3))
  (println (list 1 2 3))
  (println (hash-map :a 1 :b 2))
  (println (hash-set 1 2 2 3 4)))

; 2. Write a function that takes a number and adds 100 to it.
(defn add100
  [n]
  (+ n 100))

; 3. Write a function, dec-maker, that works exactly like the function inc-maker
; except with subtraction:
(defn dec-maker
  [size]
  #(- % size))

; 4. Write a function, mapset, that works like map except the return value is a
; set:
(defn mapset
  [func arr]
  (set (map func arr)))