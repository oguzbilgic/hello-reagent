(ns hello-reagent.prod
  (:require [hello-reagent.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
