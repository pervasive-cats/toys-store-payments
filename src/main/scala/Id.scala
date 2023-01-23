package io.github.pervasivecats

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.NonNegative

type Id = Long Refined NonNegative