(ns ^:figwheel-no-load hello-reagent.dev
  (:require
    [hello-reagent.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
